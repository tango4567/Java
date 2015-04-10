import java.io.*;
class Tictactoe
{
char matrix[][];  /* the tic tac toe matrix */
public static void main(String args[]) throws IOException
{
		  Tictactoe obj=new Tictactoe();
		  System.out.println(“This is the game of Tic Tac Toe.\n”);
		  System.out.println(“You will be playing against the computer.\n”);
		   char done =  ‘ ‘;
		  obj.init_matrix();
		  do {
			obj.disp_matrix();
			obj.get_player_move();
			done = obj.check(); /* see if winner */
			if(done!= ‘ ‘) break; /* winner!*/
			obj.get_computer_move();
			done = obj.check(); /* see if winner */
				  } 
				  while(done== ‘ ‘);
				  if(done==’X’)  System.out.println(“You won!\n”);
				  else  System.out.println(“I won!!!!\n”);
				  obj.disp_matrix(); /* show final positions */
			 }
/* Initialize the matrix. */
void init_matrix()
	{
	  matrix=new char[3][3];
	  int i, j;
	  for(i=0; i<3; i++)
		for(j=0; j<3; j++) matrix[i][j] =  ‘ ‘;
	}
/* Get a player’s move. */
void get_player_move() throws IOException
	{
	  BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	  int x, y;
	  System.out.println(“Enter X,Y coordinates for your move: “);
	  x=Integer.parseInt(buf.readLine());
	  y=Integer.parseInt(buf.readLine());
	  x–; y–;
	  if(matrix[x][y]!= ‘ ‘){
		System.out.println(“Invalid move, try again.\n”);
		get_player_move();
	  }
  else matrix[x][y] = ‘X';
}
/* Get a move from the computer. */
void get_computer_move()
{
	  int i=0, j=0;
	  for(i=0; i<3; i++){
		for(j=0; j<3; j++)
		  if(matrix[i][j]==’ ‘) break;
		if(matrix[i][j]==’ ‘) break;
	  }
	  if(i*j==9)  {
		System.out.println(“\n”);//printf(“draw\n”);
		System.exit(0);
	  }
	  else
		matrix[i][j] = ‘O';
}
/* Display the matrix on the screen. */
void disp_matrix()
{
	  int t;
	  for(t=0; t<3; t++) {
		System.out.printf(” %c | %c | %c “,matrix[t][0],
				matrix[t][1], matrix [t][2]);
		if(t!=2) System.out.printf(“%n—|—|—%n”);
	  }
	  System.out.printf(“%n”);
}
/* See if there is a winner. */
char check()
{
	  int i;
	  for(i=0; i<3; i++)  /* check rows */
		if(matrix[i][0]==matrix[i][1] &&
		   matrix[i][0]==matrix[i][2]) return matrix[i][0];
	  for(i=0; i<3; i++)  /* check columns */
		if(matrix[0][i]==matrix[1][i] &&
		   matrix[0][i]==matrix[2][i]) return matrix[0][i];
	  /* test diagonals */
	  if(matrix[0][0]==matrix[1][1] &&
		 matrix[1][1]==matrix[2][2])
		   return matrix[0][0];
	  if(matrix[0][2]==matrix[1][1] &&
		 matrix[1][1]==matrix[2][0])
		   return matrix[0][2];
	  return ‘ ‘;
}
}