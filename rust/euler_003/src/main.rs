fn main() {
    const LEN: usize = 2_000_000;
    let num = 600_851_475_143;
    let primes: [bool; LEN] = sieve_of_eratosthenes();
    let mut max_prime_factor = 0;
    for n in 2..LEN {
        if primes[n] && num % n == 0 && n > max_prime_factor {
            max_prime_factor = n;
        }
    }
    println!("{max_prime_factor}");
}
fn sieve_of_eratosthenes<const LEN: usize>() -> [bool; LEN] {
    // Returns a boolean array with all
    // primes from 0 to n (not inclusive)
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
