#include <iostream>
#include <limits>

using namespace std;

int main() {
    const int SIZE = 6;
    float alturas[SIZE];
    float maiorAltura = numeric_limits<float>::min();
    float menorAltura = numeric_limits<float>::max();

    cout << "Digite as alturas das jogadoras (em metros):" << endl;

    for (int i = 0; i < SIZE; ++i) {
        cin >> alturas[i];

        if (alturas[i] < menorAltura) {
            menorAltura = alturas[i];
        }

        if (alturas[i] > maiorAltura) {
            maiorAltura = alturas[i];
        }
    }

    cout << "A menor altura é: " << menorAltura << " metros" << endl;
    cout << "A maior altura é: " << maiorAltura << " metros" << endl;

    return 0;
}