//? Onyx, 2026.
//? https://github.com/kokovt
//? Amicable numbers are numbers who are paired since their factors add up to the other number, and vice versa.
//? So I need:
//? A: A function that sums up all factors
//? B: A function that checks, and prints the amicable numbers.

function sum_factors(number) {
    //? Base cases. We don't care about numbers <0
    if (number < 1) return 0;
    //? The sum of 1's divisors are 1. Just save a tiny bit of cpu time.
    if (number == 1) return 1;

    let total_sum = 1;

    //? Hey I forgot I can do ** instead of math.pow!
    //! Remember not to start at 1, it will mess up all of the code!
    //! I recognized I made that mistake too late --- There goes half an hour.
    for (let i = 2; i <= Math.ceil(number ** 0.5); i++) {
        //? If you want this to be faster find a way to get rid of the *forbidden modulo*
        //? Any division / modulo  work is hard on computers.
        //? Division is the slowest thing for a cpu to do.
        //? From... personal experience on the cpu I designed.
        if (number % i == 0) {
            total_sum += i;
            //? If the divisors are not the same, add its opposite as well.
            if (Math.floor(number / i) != i) {
                total_sum += Math.floor(number / i);
            }
        }
    }

    return total_sum;
}


function find_amicable_pairs(limit) {
    let amicable_pairs = [];
    //? 0 and 1 cannot be amicable at all so skip them.
    for (let i = 2; i <= limit; i++) {
        let test = sum_factors(i);

        //? If we only print if I is less than the other paired number, we avoid printing the same numbers twice.
        if (test > i && sum_factors(test) == i) {
            amicable_pairs.push([i, test]);
        }
    }

    console.log(amicable_pairs);
}


find_amicable_pairs(10_000)