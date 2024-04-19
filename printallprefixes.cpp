#include <iostream>
#include <string>

using namespace std;

void printAllPrefixes(const string& str) {
    int l = str.length();
    for (int i = 0; i < l; i++) {
        for (int j = 0; j <= i; j++) {
            cout << str[j];
        }
        cout << endl;
    }
}

int main() {
    cout << "Enter a String: ";
    string s;
    cin >> s;
    cout << "\nAll prefixes are:\n";
    printAllPrefixes(s);
    return 0;
}
