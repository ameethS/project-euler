#include <iostream>

/*
Takes in a year and if the year is a leap year the function returns true,
else the function returns false.
A leap year is a year that has 29 days in February rather than 28 days.
*/
bool isLeap(int year)
{
    //400 divides a leap year without a remainder, 4 also divides a leap year
    //without a remainder, but 100 doesn't divide a leap year without remainder
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
    {
        return true;
    }
    return false;
}

int main()
{
    /*
    In array months, each index represents each respective month
    0 = Jan, ..., 11 = Dec
    The actual value stored in each index represents what day of the week which
    fell on the 1st of that particular month...
    E.G. on Jan 1st 1900, it was a Monday (i.e. we started index 0/Jan with 0 value)
    Days of the week: Mon (0), Tue (1), Wed (2), Thu (3), Fri (4), Sat (5), Sun (6)
    After Sunday occurs then the value goes to -1
    */
    int months[] = {0, 3, 3, -1, 1, 4, -1, 2, 5, 0, 3, 5};
    int total = 0; //stores the total amount of Sundays
    for (int y = 1901; y < 2000; y++)
    {
        for (int i = 0; i < 12; i++) //loop from january (0) till december (11)
        {
            if (isLeap(y))
            {
                months[i] += 2;
                if (months[i] == 7)
                {
                    months[i] = 0; //set back to 0 (Monday)
                }
            }
            else //not a leap year
            {
                months[i] += 1;
            }

            if (months[i] == 6) //if the day is sunday
            {
                total++; //add one more sunday to the total sum
                months[i] = -1; //set the day back to the deafult of -1
            }
        }
    }

    std::cout << "There are " << total << " Sundays in the 20th century that fell on the 1st of a month!";

    return 0;
}
