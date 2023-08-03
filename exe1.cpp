#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

#define SIZE 5

void exibirPaises(const string paises[], int size) {
    cout << "Os países que já venceram a copa feminina são: ";
    for (int i = 0; i < size; ++i) {
        cout << paises[i] << " ";
    }
    cout << endl;
}

int main () {
    string paises[SIZE];

    cout << "Insira os nomes dos países que já venceram a  copa feminina :" << endl;
    for (int i = 0; i < SIZE; ++i) {
        cin >> paises[i];
    }

    sort(paises, paises + SIZE);

    exibirPaises(paises, SIZE);

    return 0;
}