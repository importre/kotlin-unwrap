#! /usr/bin/env python3

import os

template = '''
inline fun <{0}, R> unwrap(
{1},
        block: Unwrap.({0}) -> R): Unwrap {{
    return Unwrap().apply {{
        if ({2}) {{
            valid = true
            block({3})
        }}
    }}
}}
'''

if __name__ == '__main__':
    max = 10
    root = os.path.join('src', 'main', 'kotlin', '')
    path = [i[0] for i in os.walk(root)
            if i[0].endswith(os.sep + 'unwrap')][0].replace(root, '')
    codes = ['import {}.Unwrap\n'.format(path.replace(os.sep, '.'))]

    for iter in range(1, max + 1):
        types = ', '.join(['T{}'.format(i + 1) for i in range(iter)])
        params = ',\n'.join(['{1}t{0}: T{0}?'.format(i + 1, ' ' * 8)
                             for i in range(iter)])
        conditions = '\n{}&& '.format(' ' * 16) \
            .join(['t{} != null'.format(i + 1) for i in range(iter)])
        args = ', '.join(['t{}'.format(i + 1) for i in range(iter)])
        code = template.format(types, params, conditions, args)
        codes.append(code)

    filename = os.path.join(root, path, 'Funs.kt')
    with open(filename, 'w') as fout:
        fout.write(''.join(codes).strip() + '\n')
    pass
