#! /usr/bin/env python3

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
    codes = ['import com.importre.unwrap.Unwrap\n']
    for iter in range(1, max + 1):
        types = ', '.join(['T{}'.format(i + 1)
                           for i in range(iter)])
        params = ',\n'.join(['        t{0}: T{0}?'.format(i + 1)
                             for i in range(iter)])
        conditions = '\n                && '.join(['t{} != null'.format(i + 1)
                                                   for i in range(iter)])
        args = ', '.join(['t{}'.format(i + 1)
                          for i in range(iter)])
        code = template.format(types, params, conditions, args)
        codes.append(code)

    with open('src/main/kotlin/com/importre/unwrap/Funs.kt', 'w') as fout:
        fout.write(''.join(codes).strip() + '\n')
    pass
