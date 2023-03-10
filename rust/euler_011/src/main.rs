// Find the largest product in a 20 by 20 grid, with four adgacent numbers in the same direction
// (up, down, left, right, or diagonally)
use std::cmp;
use std::fs::File;
use std::io::BufRead;
use std::io::BufReader;
fn main() {
    let filename = "euler_011.txt";
    let file = File::open(filename).unwrap();
    let reader = BufReader::new(file);
    // Once we have our reader, we need to add to a Vec of Vecs, by iterating through the lines in
    // the file, splitting each line into whitespace, parsing those values to u64, and then
    // collecting those values in its own Vec, so that we end up with a Vec of 20 Vecs
    let grid: Vec<Vec<u64>> = reader
        .lines()
        .map(|line| {
            line.unwrap()
                .split_whitespace()
                .map(|digit| digit.parse::<u64>().unwrap())
                .collect()
        })
        .collect();
    print_grid(grid.clone());
    let (max_horizontal, max_vertical, max_diagonal) = max_product(grid);
    println!(
        "\nMax Horizontal: {}, Max Vertical: {}, Max Diagonal: {}",
        max_horizontal, max_vertical, max_diagonal,
    );
    let mut max = cmp::max(max_horizontal, max_vertical);
    max = cmp::max(max, max_diagonal);
    println!("Max: {}", max);
}
fn print_grid(grid: Vec<Vec<u64>>) {
    for i in 0..grid.len() {
        println!("");
        for j in 0..grid[i].len() {
            print!(" |{:0>2}| ", grid[i][j])
        }
    }
}

fn max_product(grid: Vec<Vec<u64>>) -> (u64, u64, u64) {
    let mut max_diagonal = 0;
    let mut max_vertical = 0;
    let mut max_horizontal = 0;
    // horizontal
    for i in 0..(grid.len() - 3) {
        for j in 0..(grid.len() - 3) {
            let prod = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
            max_horizontal = cmp::max(prod, max_horizontal);
        }
    }
    // vertical
    for i in 0..grid.len() {
        for j in 0..(grid.len() - 3) {
            let prod = grid[j][i] * grid[j + 1][i] * grid[j + 2][i] * grid[j + 3][i];
            max_vertical = cmp::max(prod, max_vertical);
        }
    }

    // diagonal starting from top left
    for i in 0..(grid.len() - 3) {
        for j in 0..(grid.len() - 3) {
            let prod = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
            max_diagonal = cmp::max(prod, max_diagonal);
        }
    }
    for i in (3..(grid.len() - 1)).rev() {
        for j in 0..(grid.len() - 3) {
            let prod = grid[i][j] * grid[i - 1][j + 1] * grid[i - 2][j + 2] * grid[i - 3][j + 3];
            max_diagonal = cmp::max(prod, max_diagonal);
        }
    }
    (max_horizontal, max_vertical, max_diagonal)
}
