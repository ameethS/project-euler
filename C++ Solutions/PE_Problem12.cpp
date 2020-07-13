#include <iostream>
#include <cmath>

/*
Problem 12 - Highly Divisible Triangular Number
Objective: to find the first triangular number number to have over 500 divisors
*/

int div(int n)
{
    int d = 0;
    int s = sqrt(n);
    for (int i = 1; i < s; i++)
    {
        if (n % i == 0)
        {
            d++;
        }

    }

    d *= 2;

    if ( s * s == n)
        d += 1;

    return d;
}

int getNum(int p)
{
    int u = 0;
    for (int i = 1; i < p + 1; i++)
    {
        u += i;
    }
    return u;
}

int main()
{
    int temp = 0;
    int pos = 1;
    bool found = false;
    while (!found)
    {
        temp = getNum(pos);
        if (div(temp) > 500)
        {
            found = true;
            break;
        }
        pos++;
    }
    std::cout << getNum(pos);
    return 0;
}
