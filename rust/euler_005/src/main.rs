fn main() {
    // Find the smallest number evenly divisible by every number from every 1 - 20
    let n = find_smallest_divisible_by_all_under_n(20);
    println!("{n}");
}
fn find_smallest_divisible_by_all_under_n(n: u64) -> u64 {
    let mut a = 2520; // Start here since thats the first number evenly divisible by 1-10
    let mut i = 2;
    while i <= n {
        // Loop until a is evenly divisible by 1 - n
        if a % i != 0 {
            i = 2;
            a += 1;
        } else {
            i += 1;
        }
    }
    a
} // Pretty slow, should find a way to optimize this one
