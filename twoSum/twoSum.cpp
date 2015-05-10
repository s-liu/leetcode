#include <vector>
#include <unordered_map>
#include <iostream>

using namespace std;

class Solution {
public:
    static vector<int> twoSum(vector<int> &numbers, int target) {
        int index1, index2;
        unordered_map<int,int> foo = unordered_map<int,int>();
        for (int i = 0; i < numbers.size(); i++) {
            int bar = target - numbers[i];
            if (foo.count(numbers[i]) > 0) {
                index1 = foo[numbers[i]]+1;
                index2 = i+1;
                break;
            } else {
                foo[bar]=i;
            }
        }
    
        cout << "index1=" << index1 << ", index2=" << index2 << endl;
    }
};

int main() {
    vector<int> a = vector<int>();
    a.push_back(0);
    a.push_back(4);
    a.push_back(3);
    a.push_back(0);
    Solution::twoSum(a, 0);
}
