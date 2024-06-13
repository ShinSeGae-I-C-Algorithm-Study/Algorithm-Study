class Solution
{
    public int solution(int hp)
    {
        int a = 5;
        int b = 3;
        int c = 1;

        int answer = 0;
        while(hp > 4)
        {
            hp -= a;
            answer++;
        }

        if(hp == 4)
        {
            answer += 2;
        }

        else
        {
            if(hp==3)
            {
                answer += 1;
            }

            if(hp==2)
            {
                answer += 2;
            }

            if(hp==1)
            {
                answer+=1;
            }
        }

        return answer;
    }
}