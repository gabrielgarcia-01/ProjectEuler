use num_bigint::BigUint;
use num_traits::One;
fn main() {
    let paths = factorial(40) / (factorial(20) * factorial(20));
    println!("{}", paths);
}

fn factorial(n: usize) -> BigUint {
    (1..=n).fold(One::one(), |a, b| a * b)
}
