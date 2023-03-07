fn main() {
    let n = find_smallest_divisible_by_all_under_n(20);
    println!("{n}");
}
fn find_smallest_divisible_by_all_under_n(n: u64) -> u64 {
    let mut a: u64 = 0;
    let mut i = 1;
    while i <= n {
        i += 1;
        if a % i != 0 {
            a += 1;
            i = 2;
        }
    }
    a
}
