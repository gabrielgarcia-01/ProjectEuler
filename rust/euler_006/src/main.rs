fn main() {
    // Find the difference between the sum of the squares and square of the sum of the
    // first 100 natural numbers
    let difference = sum_squares(100);
    println!("{difference}");
}
fn sum_squares(n: u64) -> u64 {
    let mut square_of_sums = 0;
    let mut sum_of_squares = 0;
    for i in 1..=n {
        sum_of_squares += i * i;
        square_of_sums += i;
    }
    square_of_sums * square_of_sums - sum_of_squares
}
