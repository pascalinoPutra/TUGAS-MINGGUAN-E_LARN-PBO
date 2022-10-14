#include <iostream>
using namespace std;
int main()
{
    int bnykMhs;
    string data[100][100];

    int x = 1;
    while (x <= 27)
    {
        cout << "*";
        x++;
    }

    cout << "\n*  program data mahasiswa * " << endl;
    int k = 1;
    do
    {
        cout << "*";
        k++;
    } while (k <= 27);
    cout << "\nMasukan banyak mahasiswa : ";
    cin >> bnykMhs;

    cout << "Masukan data mahasiswa :" << endl;
    for (int a = 0; a < bnykMhs; a++)
    {
        cout << "" << endl;
        cout << "mahasiswa ke-" << a + 1 << endl;
        for (int b = 0; b < 4; b++)
        {
            if (b == 0)
            {
                cout << "Nama Mahasiswa : ";
            }
            else if (b == 1)
            {
                cout << "NIM : ";
            }

            else if (b == 2)
            {
                cout << "kelas : ";
            }

            else
            {
                cout << "jurusan : ";
            }

            cin >> data[a][b];
        }
    }
    cout << "----------------------------------------" << endl;
    cout << "\n data seluruh mahasiswa yang sudah di input" << endl;
    cout << "----------------------------------------" << endl;
    cout << "NIM \t NAMA \t\t Kelas \t\t JURUSAN \t" << endl;
    for (int a = 0; a < bnykMhs; a++)
    {
        for (int b = 0; b < 4; b++)
        {
            cout << data[a][b] << "\t\t";
        }
        cout << endl;
    }
}