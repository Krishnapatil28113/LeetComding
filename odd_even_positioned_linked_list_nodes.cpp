/*
# Problem Statement: To rearrange the nodes based on the positions even or odd
---------------------------------------------------------------
# How to think:
* Just need to think carefully about the edge cases or when the iteration ends and when we have to link it to the other half of the linked list
---------------------------------------------------------------
*/

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