//? Onyx, 2026.
//? https://github.com/kokovt

function isPrime(number) {
    // console.log(number);
    // Any number 1 and under is not prime.
    if(number <= 1) return false;

    // Two is prime. This will help with checking evens without false positives.
    if(number == 2) return true;

    // If it is divisible by 2, then it is not prime.
    if(number % 2 == 0) return false;

    // Check all numbers that are less than the square root of the number.
    // The number is prime if no factors are found up to sqrt(n).

    const limit = Math.ceil(Math.sqrt(number));
    for(let i = 2; i < limit; i++) {
        // console.log(i);
        if(number%i == 0) return false;
    }

    return true;
}


function getPrimes(limitNumber) {
    //? If its one or less there is no prime numbers at all.
    if(limitNumber <= 1) return process.stdout.write("There is no prime numbers prior to and including this number.");
    //? Two is a constant
    if(limitNumber == 2) return process.stdout.write("2 is the only prime number in this set.");
    process.stdout.write(`2`);
    for(let i = 3; i <= limitNumber; i++) {
        if(isPrime(i)) process.stdout.write(`,${i}`);
    }
}

getPrimes(-12);
console.log();
getPrimes(2);
console.log();
console.log("Primes up to 15:");
getPrimes(15);
console.log("\nPrimes up to 50:");
getPrimes(50);
console.log("\nPrimes up to 75:");
getPrimes(75);
console.log("\nPrimes up to 100:");
getPrimes(100);

