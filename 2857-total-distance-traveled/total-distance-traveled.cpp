class Solution {
public:
    int distanceTraveled(int mainTank, int additionalTank) {
        int litres = 0;
        while(mainTank>=5 && additionalTank>=1) {
            litres +=5;
            mainTank -=5;
            mainTank +=1;
           additionalTank -=1;  
        }
        return (mainTank+litres)*10;
        
    }
};