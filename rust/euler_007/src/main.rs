fn main() {
    // Find the 10_001st prime number
    let nth_prime = nth_prime(10_001);
    println!("{nth_prime}");
}
fn nth_prime(n: u64) -> u64 {
    // Creates an array of primes by calling is_prime on every other
    // number starting at 3
    let mut primes: Vec<u64> = Vec::new();
    primes.push(2);
    let mut current = 3;
    while primes.len() < n.try_into().unwrap() {
        if is_prime(current, &primes) {
            primes.push(current);
        }
        current += 2;
    }
    primes[primes.len() - 1]
}
fn is_prime(n: u64, primes: &Vec<u64>) -> bool {
    let float_n = n as f64;
    let limit = float_n.sqrt();
    let limit = limit as u64;
    let mut result: bool = false;
    for prime in primes {
        if n % prime == 0 {
            result = false;
            break;
        }
        if prime > &limit {
            result = true;
            break;
        }
    }
    result
}
