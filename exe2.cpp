#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

#define SIZE 8

void exibirPaisesSemTitulo(const string paises[], const int titulos[], int size) {
    cout << "Países que nunca venceram a Copa do Mundo Feminina: " << endl;
    for (int i = 0; i < size; ++i) {
        if (titulos[i] == 0) {
            cout << paises[i] << endl;
        }
    }
}

int main () {
    string paises[SIZE] ;
    int titulos[SIZE];

    

    cout << "Insira os nomes dos países que participaram da Copa do MUndo Feminina :" << endl;
    for (int i = 0; i < SIZE; ++i) {
        cin >> paises[i];
    }

    cout << "Insira a quantidade de títulos de cada país: " << endl;
    for (int i = 0; i < SIZE; ++i) {
        cout << paises[i] << ": ";
        cin >> titulos[i];
    }

    sort(paises, paises + SIZE);
    
    exibirPaisesSemTitulo(paises, titulos, SIZE);

    return 0;
}