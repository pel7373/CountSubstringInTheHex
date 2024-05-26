# CountSubstringInTheHex
Потрібно знайти послідовність букв. Під "послідовністю букв" будемо розуміти послідовність букв, оточену числами з обох сторін у шістнадцятковому поданні числа.

Наприклад, число 6817 має шістнадцяткове подання 1АА1 і містить послідовність букв довжиною 2.

Число 447355553 має шістнадцяткове подання 1AAA1AA1 і містить дві послідовності літер: одну довжиною 3 і одну довжини 2.
Отже найбільша довжина 3.

Число 176845 має шістнадцяткове подання 2B2CD і містить одну послідовність букв довжиною 1.

Кількість 4660 має шістнадцяткове подання 1234 і не має послідовностей букв.
Результат 0.

Число 240589 має шістнадцяткове подання 3ABCD і не має послідовностей букв.

Число 160 має шістнадцяткове подання A0 і не має послідовностей букв. 

Output:
=====================

The decimal number 6817 is processed and has been converted in hex format: 1AA1

The group #1 is AA, length 2

One match was found with length of substring 2

=====================

The decimal number 447355553 is processed and has been converted in hex format: 1AAA1AA1

The group #1 is AAA, length 3

The group #2 is AA, length 2

2 matches were found, of which the maximum length was 3

=====================

The decimal number 176845 is processed and has been converted in hex format: 2B2CD

The group #1 is B, length 1

One match was found with length of substring 1

=====================

The decimal number 4660 is processed and has been converted in hex format: 1234

Sorry, no matches were found

=====================

The decimal number 240589 is processed and has been converted in hex format: 3ABCD

Sorry, no matches were found

=====================

The decimal number 160 is processed and has been converted in hex format: A0

Sorry, no matches were found
