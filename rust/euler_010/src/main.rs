fn main() {
    // Find the sum of all prime numbers under 2_000_000
    const LEN: usize = 2_000_000;
    let primes: [bool; LEN] = sieve_of_eratosthenes();
    let mut sum = 2;
    let mut n = 3;
    while n < LEN {
        if primes[n] {
            sum += n;
        }
        n += 2;
        // Can do += 2 since we start at three, and checking if an even number
        // is prime is a waste of time and an unnecessary array access
    }
    println!("{sum}");
}
fn sieve_of_eratosthenes<const LEN: usize>() -> [bool; LEN] {
    // Returns a boolean array of all
    // prime numbers under LEN using the Sieve of Eratosthenes
    let mut primes = [true; LEN];
    primes[0] = false;
    primes[1] = false;

    for i in 2..LEN {
        if primes[i] {
            for j in (i * i..LEN).step_by(i) {
                primes[j] = false;
            }
        }
    }
    primes
}
