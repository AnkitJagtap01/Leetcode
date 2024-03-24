// // Bruteforce - Time: worse than O((mn)^2) Space: O(m*n)
// // Pseudocode
// while (true) {
//     boolean changed = false;
//     // Scan grid and try to rot neighbors of each rotten orange
//     for each cell in grid {
//         if (cell is rotten) {
//             for each neighbor {
//                 if (neighbor is fresh) {
//                     rot neighbor;
//                     changed = true;
//                 }
//             }
//         }
//     }
//     if (!changed) break; // No new oranges rotted, stop the process
// }
[
