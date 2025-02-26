package algorithm.bfs;

public class BFS1 {
	public static int l,r;//l++��ʾ�Ӷ����е�����r��ʾ�Ӷ��������
    public static int[][] queue = new int[101*101][2];
    public static boolean[][] st = new boolean[101][101];//true��ʾ���ʹ�

    //public static int x,y,seas = 0;
    //��¼����
    //{-1,0} {0,1} {1,0} {0,-1}��ʾ�ƶ�����
    // 0      1     2     3
    public static int[] move = {-1,0,1,0,-1};
    
    public int maxDistance(int[][] grid) {
        l=r=0;
        int n = grid.length;//��
        int m = grid[0].length;//��
        int seas = 0;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 0) {
                    st[i][j] = false;
                    seas++;
                }
                else {
                    st[i][j] = true;
                    queue[r][0] = i;
                    queue[r++][1] = j;
                }
            }
        }
        if(seas == 0 || seas == n*m) return -1;

        int level = 0;
        while(l < r){
            level++;
            //��������Ҫ��ô��β���
            int size = r - l;
            //��������
            for(int i = 0,nx,ny,x,y;i<size;i++){
                x = queue[l][0]; 
                y = queue[l++][1];
                //��������ڵ㣬
                for(int j =0;j<4;j++){
                    nx = x + move[j];
                    ny = y + move[j+1];

                    //��ӽ������
                    if(nx >= 0 && nx < n && ny >=0 && ny <m && !st[nx][ny]){
                        st[nx][ny] = true;
                        queue[r][0] = nx;
                        queue[r++][1] = ny;
                    }
                }  
            }
        }
        return level -1;
    }
}
