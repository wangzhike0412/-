#define _CRT_SECURE_NO_WARNINGS	1

#include"game.h"


menu()
{
	printf("************************\n");
	printf("*******  1.play  *******\n");
	printf("*******  2.exit  *******\n");
	printf("************************\n");
}
void game()
{
	//����Ϣ�洢
	//1.���ú�����Ϣ�洢
	char mine[ROWS][COLS] = { 0 };
	//2.�Ų�����Ϣ�洢
	char show[ROWS][COLS] = { 0 };
	//��ʼ��
	Ininboard(mine, ROWS, COLS,'0');
	Ininboard(show, ROWS, COLS,'*');
	//��ӡ����
	/*Displayboard(mine, ROW, COL);*/
	Displayboard(show, ROW, COL);
	//������
	Setmine(mine, ROW, COL);
	//Displayboard(mine, ROW, COL);//��ʾ�׵�λ��

	//�Ų���
	Findmine(mine,show, ROW, COL);
	
}

void test()
{
	int input = 0;
	srand((unsigned int)time(NULL));//�������
	do
	{
		menu();
		printf("��ѡ��:>");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
			printf("�˳���Ϸ\n");
			break;
		default:
			printf("ѡ�����������ѡ��\n");
			break;
		}

	} while (input);
}
int main()
{
		test();
	return 0;
}