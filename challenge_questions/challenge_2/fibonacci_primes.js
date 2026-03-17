//? Onyx, 2026.
//? https://github.com/kokovt

function checkIfFibonacciAndPrime(number) {
    //? There are no fibonacci numbers beneath 0
    //? This also just saves me from the pure fact you cant take the square root of a negative number.
    if(number < 0) {
        console.log("There is no fibonacci numbers beneath 0");
    }

    //? Just to make the output look nice, and save on those precious nanoseconds.
    if(number == 0) {
        process.stdout.write(`${number}`);
        return;
    }

    //? Do the math to test if the number is a fibonacci number
    //? If either one of these are true, the number is fibonacci number.
    //? "Hes fibbing off his nacci"
    let highTestNumber = Math.sqrt(5*Math.pow(number,2)+4);
    let lowTestNumber = Math.sqrt(5*Math.pow(number,2)-4);



    //? This is testing if the number is equal to the floor of itself.
    //? If it is, then there is no decimal, making it a perfect square.
    if(Math.floor(highTestNumber) == highTestNumber || Math.floor(lowTestNumber) == lowTestNumber) {
        if(isPrime(number)) {
            //! Concatenation in javscript can be wierd, make sure its not a number.
            //! Sometimes javascripts interpreter will do wierd things with type-inference.
            process.stdout.write(`,${number}`);
        }
    }
}

//? Just ripped from isPrime again.
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
    for(let i = 2; i < limit; i++) {
        // console.log(i);
        if(number%i == 0) return false;
    }

    return true;
}

//? Just loop through every number from 0 to 100,000 to test them.
for(let i = 0; i < 100000; i++) {
    checkIfFibonacciAndPrime(i);
}