#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Define Player structure
struct Player {
    int jerseyNo;
    char name[50];
    int runs;
    int wickets;
    int matches;
};
// Function prototypes
void addPlayer(struct Player **players, int *count);
void removePlayer(struct Player *players, int *count, int jerseyNo);
void searchPlayer(struct Player *players, int count);
void updatePlayer(struct Player *players, int count);
void displayAll(struct Player *players, int count);
void sortPlayers(struct Player *players, int count);
void top3Players(struct Player *players, int count);

int main() {
    int count = 5; // Start with 5 players (hardcoded)
    int choice, jersey;
       
    // Allocate memory for 5 players
    struct Player *players = (struct Player *)malloc(count * sizeof(struct Player));//allow adding //removing player at runtime
 

    // Hardcoded 5 player details
    struct Player initial[5] = {
        {7, "Dhoni", 10500, 1, 350},
        {18, "Kohli", 13000, 4, 290},
        {45, "Rohit", 9800, 2, 250},
        {12, "Yuvraj", 8700, 111, 304},
        {99, "Bumrah", 150, 240, 100}
    };
    memcpy(players, initial, 5 * sizeof(struct Player));//Copies hardcoded data into dynamic array

    printf("\n ---Player Management System---\n");

    while (1) {
        printf("\nMenu:\n");
        printf("1. Add Player\n");
        printf("2. Remove Player\n");
        printf("3. Search Player\n");
        printf("4. Update Player Data\n");
        printf("5. Display All Players\n");
        printf("6. Display Sorted Players\n");
        printf("7. Top 3 Players (by Runs & Wickets)\n");
        printf("8. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);//keeps running until user choose 8

        switch (choice) {
            case 1:
                addPlayer(&players, &count);
                break;
            case 2:
                printf("Enter Jersey Number to remove: ");
                scanf("%d", &jersey);
                removePlayer(players, &count, jersey);
                break;
            case 3:
                searchPlayer(players, count);
                break;
            case 4:
                updatePlayer(players, count);
                break;
            case 5:
                displayAll(players, count);
                break;
            case 6:
                sortPlayers(players, count);
                break;
            case 7:
                top3Players(players, count);
                break;
            case 8:
                free(players);
                printf("\nExiting... Thank you!\n");
                exit(0);
            default:
                printf("Invalid choice! Try again.\n");
        }
    }
    return 0;
}

// Function to add a new player
void addPlayer(struct Player **players, int *count) //pointers to the no. of players in current array//** see the updated array address after realloc
{
    *count += 1;//we adding new player
    *players = (struct Player *)realloc(*players, (*count) * sizeof(struct Player));//resizing already allocated block

    struct Player *newPlayer = &((*players)[*count - 1]);//access the last element in the array

    printf("\nEnter Player Details:\n");
    printf("Jersey Number: ");
    scanf("%d", &newPlayer->jerseyNo);
    printf("Name: ");
    scanf("%s", newPlayer->name);
    printf("Runs: ");
    scanf("%d", &newPlayer->runs);
    printf("Wickets: ");
    scanf("%d", &newPlayer->wickets);
    printf("Matches: ");
    scanf("%d", &newPlayer->matches);

    printf(" Player added successfully!\n");
}

// Function to remove player by jersey number
void removePlayer(struct Player *players, int *count, int jerseyNo) {
    int i, found = 0;//flag !found 0 & found 1
    for (i = 0; i < *count; i++) {
        if (players[i].jerseyNo == jerseyNo) {
            found = 1;
            for (int j = i; j < *count - 1; j++)//shift elements left
             {
                players[j] = players[j + 1];
            }
            *count -=1;
            printf(" Player with Jersey %d removed successfully!\n", jerseyNo);
            break;
        }
    }
    if (!found)
        printf(" Player not found!\n");
}

// Function to search player by name or jersey number
void searchPlayer(struct Player *players, int count) {
    int choice, jersey, found = 0;
    char name[50];

    printf("Search by: 1. Jersey No  2. Name : ");
    scanf("%d", &choice);

    if (choice == 1) {
        printf("Enter Jersey Number: ");
        scanf("%d", &jersey);
        for (int i = 0; i < count; i++) {
            if (players[i].jerseyNo == jersey) {
                printf("\nPlayer Found:\n");
                printf("Jersey: %d | Name: %s | Runs: %d | Wickets: %d | Matches: %d\n",
                       players[i].jerseyNo, players[i].name, players[i].runs, players[i].wickets, players[i].matches);
                found = 1;
                break;
            }
        }
    } else {
        printf("Enter Name: ");
        scanf("%s", name);
        for (int i = 0; i < count; i++) {
            if (strcmp(players[i].name, name) == 0) {
                printf("\nPlayer Found:\n");
                printf("Jersey: %d | Name: %s | Runs: %d | Wickets: %d | Matches: %d\n",
                       players[i].jerseyNo, players[i].name, players[i].runs, players[i].wickets, players[i].matches);
                found = 1;
                break;
            }
        }
    }

    if (!found)
        printf(" Player not found!\n");
}

// Function to update player data
void updatePlayer(struct Player *players, int count) {
    int jersey, found = 0;
    printf("Enter Jersey Number to update: ");
    scanf("%d", &jersey);

    for (int i = 0; i < count; i++) {
        if (players[i].jerseyNo == jersey) {
            printf("\nEnter new Runs: ");
            scanf("%d", &players[i].runs);
            printf("Enter new Wickets: ");
            scanf("%d", &players[i].wickets);
            printf("Enter new Matches: ");
            scanf("%d", &players[i].matches);
            printf(" Player data updated successfully!\n");
            found = 1;
            break;
        }
    }
    if (!found)
        printf(" Player not found!\n");
}

// Function to display all players
void displayAll(struct Player *players, int count) {
    printf("\n--- All Player Records ---\n");
    for (int i = 0; i < count; i++) {
        printf("%d) Jersey: %d | Name: %s | Runs: %d | Wickets: %d | Matches: %d\n",
               i + 1, players[i].jerseyNo, players[i].name, players[i].runs,
               players[i].wickets, players[i].matches);
    }
}

// Function to sort players by runs and wickets
void sortPlayers(struct Player *players, int count) {
    struct Player temp;//used to swaping two player struct
    for (int i = 0; i < count - 1; i++) {
        for (int j = i + 1; j < count; j++) {
            if (players[i].runs < players[j].runs) // Sort by runs descending
            { 
                temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }
    }

    printf("\n Players Sorted by Runs (Descending):\n");
    displayAll(players, count);
}

// Function to show top 3 players
void top3Players(struct Player *players, int count) {
    
    // Sort by runs descending
    struct Player temp;
    for (int i = 0; i < count - 1; i++) {
        for (int j = i + 1; j < count; j++) {
            if (players[i].runs < players[j].runs) {
                temp = players[i];
                players[i] = players[j];//if i has fewer runs than j ,swap them.
                players[j] = temp;
            }
        }
    }

    printf("\n Top 3 Players by Runs:\n");
    for (int i = 0; i < 3 && i < count; i++) {
        printf("%d) %s - %d Runs\n", i + 1, players[i].name, players[i].runs);
    }

    // Sort by wickets descending for next display
    for (int i = 0; i < count - 1; i++) {
        for (int j = i + 1; j < count; j++) {
            if (players[i].wickets < players[j].wickets) {
                temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }
    }

    printf("\n Top 3 Players by Wickets:\n");
    for (int i = 0; i < 3 && i < count; i++) {
        printf("%d) %s - %d Wickets\n", i + 1, players[i].name, players[i].wickets);
    }
}
