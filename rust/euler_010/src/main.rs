fn main() {
    const LEN: usize = 2_000_000;
    let primes: [bool; LEN] = sieve_of_eratosthenes();
    let mut sum = 0;
    for n in 2..LEN {
        if primes[n] {
            sum += n;
        }
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
