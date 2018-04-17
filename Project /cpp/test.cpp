#include <iostream>

void fib()
{
    fib2()
}

void fib2()
{
  fib()

}

int main(int argc, char *argv[])
{
    fib();
    fib2();

    return 0;
}
