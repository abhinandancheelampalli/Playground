#include <iostream>
using namespace std;

struct Person
{
    char name[50];
    int age;
    float salary;
};

int main()
{
    Person p1;
    
    cin.get(p1.name, 50);
    cin >> p1.age;
    cin >> p1.salary;

    cout << "\nStudent Details" << endl;
    cout << "Name: " << p1.name << endl;
    cout <<"Roll: " << p1.age << endl;
    cout << "Marks: " << p1.salary;

    return 0;
}