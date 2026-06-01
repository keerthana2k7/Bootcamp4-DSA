1int singleNumber(int*nums,int n){
2    int ans=0;
3    for(int i=0;i<n;i++)ans^=nums[i];
4    return ans;
5}
6