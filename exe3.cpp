#include <iostream>

using namespace std;

int main() { 
    const int SIZE = 10; 
    int idades [SIZE];
    int soma = 0;

    cout << "Digite as idades das jogadoras :" << endl;

    for (int i =0; i < SIZE; ++i) {
        cin >> idades[i];
        soma += idades[i];
    }

    double media = static_cast<double>(soma) / SIZE;
    
    cout << "A média das idades é :" << media << endl;

    return 0;
}