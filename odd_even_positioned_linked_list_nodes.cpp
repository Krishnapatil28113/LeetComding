#include <bits/stdc++.h>
using namespace std;

class Node
{
public:
    int value;
    Node *next;
    Node(int value) : value(value), next(nullptr){};
};

Node *oddEvenLinkedList(Node *head)
{
    if (head->next == nullptr)
    {
        return head;
    }
    else
    {
        Node *temp1 = head;
        Node *temp2 = head->next;
        Node *head2 = temp2;

        while (temp2 != nullptr && temp2->next != nullptr)
        {

            temp1->next = temp2->next;
            temp1 = temp1->next;

            temp2->next = temp1->next;
            temp2 = temp2->next;
        }

        temp1->next = head2;
        return head;
    }
}