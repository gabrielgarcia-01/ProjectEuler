fn main() {
    let mut sum = 0;
    for i in 3..1_000 {
        if i % 3 == 0 {
            sum += i;
        } else if i % 5 == 0 {
            sum += i;
        }
    }
    println!("{sum}");
}
