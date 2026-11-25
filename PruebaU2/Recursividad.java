int sumaPares(int n) {
    if (n < 2)
        return 0;

    if (n % 2 != 0)
        n--;

    return n + sumaPares(n - 2);
}

