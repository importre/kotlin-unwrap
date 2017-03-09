#! /usr/bin/env python3

import os

impl = '''
class Unwrap(private var valid: Boolean) {
    infix fun <R> nah(f: () -> R) {
        if (!valid) f()
    }
}
'''

template = '''
inline fun <{0}, R> unwrap(
        {1},
        block: ({0}) -> R): Unwrap {{
    val valid = null !in arrayOf{4}({2})
    if (valid) block({3})
    return Unwrap(valid = valid)
}}
'''

if __name__ == '__main__':
    max = 5
    root = os.path.join('src', 'main', 'kotlin', '')
    path = [i[0] for i in os.walk(root)
            if i[0].endswith(os.sep + 'unwrap')][0].replace(root, '')
    codes = ['package {}\n'.format(path.replace(os.sep, '.')), impl]

    for iter in range(1, max + 1):
        types = ', '.join(['T{}'.format(i + 1) for i in range(iter)])
        params = ', '.join(['t{0}: T{0}?'.format(i + 1) for i in range(iter)])
        args1 = ', '.join(['t{}'.format(i + 1) for i in range(iter)])
        args2 = ', '.join(['t{}!!'.format(i + 1) for i in range(iter)])
        arrayType = '<Any?>' if (iter == 1) else ''
        code = template.format(types, params, args1, args2, arrayType)
        codes.append(code)

    filename = os.path.join(root, path, 'Unwrap.kt')
    with open(filename, 'w') as fout:
        fout.write(''.join(codes).strip() + '\n')
    pass
