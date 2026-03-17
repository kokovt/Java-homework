//? Onyx, 2026.
//? https://github.com/kokovt

//? Example algorithm in a way I know.

function isPrime(number) {
    console.log(number);
    // Any number 1 and under is not prime.
    if(number <= 1) return false;

    // Two is prime. This will help with checking evens without false positives.
    if(number == 2) return true;

    // If it is divisible by 2, then it is not prime.
    if(number % 2 == 0) return false;

    // Check all numbers that are less than the square root of the number.
    // The number is prime if no factors are found up to sqrt(n).

    const limit = Math.ceil(Math.sqrt(number));
    for(let i = 2; i <= limit; i++) {
        // console.log(i);
        if(number%i == 0) return false;
    }

    return true;
}

console.log(isPrime(2147483647));
console.log(isPrime(2147483629));
console.log(isPrime(3215031751));
console.log(isPrime(1231551679889));