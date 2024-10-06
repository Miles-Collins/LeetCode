func canPlaceFlowers(flowerbed []int, n int) bool {
\tcount := 0
\tfor i := 0; i < len(flowerbed); i++ {
\t\tif flowerbed[i] == 0 {
\t\t\tisEmptyLeft := (i == 0) || (flowerbed[i-1] == 0)
\t\t\tisEmptyRight := (i == len(flowerbed) -1) || (flowerbed[i+1] == 0)

\t\t\tif isEmptyLeft && isEmptyRight {
\t\t\t\tcount++
\t\t\t\tflowerbed[i] = 1
\t\t\t}

\t\t\tif count >= n {
\t\t\t\treturn true
\t\t\t}
\t\t}
\t}

\treturn count >= n
}