fn main() {
    let mut n = 1;
    let mut sum = 0;
    loop {
        let current_fib = nth_fib(n);
        if current_fib > 4_000_000 {
            break;
        } else if current_fib % 2 == 0 {
            sum += current_fib;
        }
        n += 1;
    }
    println!("{sum}");
}
fn nth_fib(n: u64) -> u64 {
    if n == 0 || n == 1 {
        n
    } else {
        nth_fib(n - 1) + nth_fib(n - 2)
    }
}
