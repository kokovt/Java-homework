//? Onyx, 2026.
//? https://github.com/kokovt

//? Just ripped from isPrime again.
//? AGAIN??? Waow... this is a really helpful function for this one very specific niche use case.
function isPrime(number) {
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


function rotateNumber(number) {
    //? I'm just going to use typecasting.
    //? We are *not* looking at negative numbers
    let stringNumber = String(Math.abs(number));
    return Number(stringNumber.slice(1) + stringNumber.slice(0,1));


    //! I moved away from this when switching. The performance was much much worse than I wanted.
    //! I moved to using basic math for it.
}


function findCircularPrimes() {
    for(let i = 0; i < 1_000_000; i++) {
        let stringNumber = String(i);
        let isCircularPrime = true;
        let number = i;

        for(let j = 0; j < stringNumber.length; j++) {
            if(!isPrime(number)) {
                isCircularPrime = false;
                break;
            }
            number = rotateNumber(number);
        }

        if(isCircularPrime) {
            process.stdout.write(`${i}, `);
        }
    }
}

findCircularPrimes();