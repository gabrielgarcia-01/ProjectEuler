// Find the value of the first triangle number to have over 500 divisors
// Triangle number -> sequence of numbers generated by adding all natural numbers prior
fn main() {
    let target = 500;
    let mut n_divisors: bool = false;
    let mut i = 2;
    let mut current_tnum = 1;
    while !n_divisors {
        current_tnum += i;
        if num_of_divisors(current_tnum) > target {
            n_divisors = true;
            println!("{current_tnum}");
        }
        i += 1;
    }
}
fn num_of_divisors(tnum: u64) -> u64 {
    let mut div_count: u64 = 0;
    let n: u64 = (tnum as f64).sqrt() as u64;
    // Since the divisors of a number can be represented in pairs,
    // we only need to iterate to tnum.sqrt()
    for i in 1..n {
        if tnum % i == 0 {
            div_count += 2;
        }
    }
    if n * n == tnum {
        // If the number is a perfect square, theres an extra divisor (its square root)
        div_count += 1;
    }
    div_count
}