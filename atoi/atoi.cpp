
#include <vector>
#include <unordered_map>
#include <iostream>

using namespace std;

class Solution {
public:
    static int atoi(const char *str) {
        int length = strlen(str);
        int curr = 0;
        int result = 0;
        bool isPositive = true;
        for (; curr < length; curr ++) {
            if (str[curr] != 0x20 && str[curr] != 0x9) {
                break;
            }
        }
        if (str[curr] == '-') {
            isPositive = false;
            curr++;
        } else if (str[curr] == '+') {
            isPositive = true;
            curr++;
        }
        for (; curr < length; curr++) {
            if (isdigit(str[curr])) {
                if ((INT_MAX - (str[curr] - '0')) / 10 >= result) {
                    result *= 10;
                    result += (str[curr] - '0');
                } else {
                    return isPositive ? INT_MAX : INT_MIN;
                }
            } else {
                break;
            }
        }
        return isPositive ? result : 0 - result;
    } 
};

int main() {
    char num []= "-2147483647";
    Solution::atoi(num);
}
