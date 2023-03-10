// Find the pythagorean triplet for which a + b + c = 1000
// Pythagorean triplet -> a < b < c && a^2 + b^2 = c^2
fn main() {
    let mut a = 1;
    let mut b = 1;
    let mut c = 1_000;
    // 0 = 500_000 - 1_000(a+b) + ab when a < b < c
    for i in 1..1_000 {
        for j in 2..1_000 {
            if (i < j && j < c) && (500_000 - 1_000 * (i + j) + i * j == 0) {
                a = i;
                b = j;
            }
        }
    }
    c = 1_000 - a - b;
    println!("a:{a} b:{b} c:{c}");
    println!("{}", a * b * c);
}
