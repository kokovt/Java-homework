//? Onyx, 2026.
//? https://github.com/kokovt
//? This one will be slightly more difficult, since I haven’t implemented sorting in a long time.

function organize(number) {

    if (number > 9999) return console.log("Invalid Number: Too long");
    const first_digit = number % 10;
    const second_digit = (Math.floor(number / 10)) % 10;
    const third_digit = (Math.floor(number / 100)) % 10;
    const fourth_digit = Math.floor(number / 1000);

    if (first_digit == second_digit && second_digit == third_digit && third_digit == fourth_digit) {
        console.log("Invalid number: cannot have 4 repeats");
        return;
    }

    //? Now that I have the individual numbers, and the numbers are filtered by the requirements, I can sort them.
    let digits = [first_digit, second_digit, third_digit, fourth_digit];

    //? I might do bubble sort, we'll see. Bubble sort is not really efficient though.

    console.log(sort(digits, (array, i) => array[i] > array[i+1]));
    console.log(sort(digits, (array, i) => array[i] < array[i+1]));
}


function sort(array, swap_condition) {
    let sorted = false;
    let i = 0;
    let swapped_this_loop = false;
    while (sorted == false) {
        if (swap_condition(array,i)) {
            let intermediary = array[i];
            array[i] = array[i + 1];
            array[i + 1] = intermediary;
            swapped_this_loop = true;
        }

        i++;

        if(i == array.length - 1) {
            if(swapped_this_loop == false) break;
            i = 0;
            swapped_this_loop = false;
        }
    }

    return array;
}

//! Hey!!
//! It works!!
//? Time to convert this over to java.
organize(4829);
//? I *might* need to figure out the padding though.
organize(42);
organize(7777);
organize(14810);