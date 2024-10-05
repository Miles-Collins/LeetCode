func kidsWithCandies(candies []int, extraCandies int) []bool {
    maxCandies := slices.Max(candies);
    
    isMostCandy := make([]bool, len(candies));
    for i, candy := range candies {
        if candy + extraCandies >= maxCandies {
            isMostCandy[i] = true;
        }
    }

    return isMostCandy;
    }
