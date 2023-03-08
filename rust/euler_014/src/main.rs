fn main() {
    // Find the longest collatz sequence with a starting number less than 1_000_000
    let mut length = 0;
    let mut max_num = 0;

    for n in 2..1_000_000 {
        // Loop to 1_000_000 and compare each length
        let steps = collatz_generator(n);
        if steps > length {
            length = steps;
            max_num = n;
        }
    }
    println!("{max_num}");
}
// Finds the length of the collatz sequence given number num
fn collatz_generator(num: u64) -> u64 {
    let mut length = 1;
    let mut n = num;

    while n > 1 {
        if n % 2 == 0 {
            // If divisible by 2 --> n /= 2
            n /= 2;
        } else {
            // If divisble by 3 --> n = (3 * n) + 1
            n = (3 * n) + 1;
        }
        length += 1;
    }
    length
} // Can probably optimize by storing previous collatz sequences in a map based on starting number
  // and corresponding length, and add that length to current collatz sequence when we encounter a
  // number found in the map
