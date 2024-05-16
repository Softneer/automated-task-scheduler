## How to start the Application
1. Open command prompt or terminal and navigate to the folder where the jar file is located 
2. Run this command ```java -jar symbol-counter-0.0.1-SNAPSHOT.jar``` where _symbol-counter-0.0.1-SNAPSHOT.jar_ is the jarfile name 
3. Open Postman and invoke this endpoint ```http://localhost:8080/assign/specificTasks``` 

### Sample payloads 1
```
{
    "engineers": [
        {
            "engineerId": 1,
            "name": "John Doe",
            "availability": true,
            "skills": [
                {
                    "skillId": 1,
                    "skill": "Java"
                },
                {
                    "skillId": 2,
                    "skill": "Python"
                },
                {
                    "skillId": 3,
                    "skill": "Wordpress"
                }
            ]
        },
        {
            "engineerId": 2,
            "name": "Bruno Mars",
            "availability": true,
            "skills": [
                {
                    "skillId": 2,
                    "skill": "Python"
                },
                {
                    "skillId": 5,
                    "skill": "Devops"
                }
            ]
        },
        {
            "engineerId": 3,
            "name": "Michael Philips",
            "availability": false,
            "skills": [
                {
                    "skillId": 3,
                    "skill": "Wordpress"
                },
                {
                    "skillId": 6,
                    "skill": "Database"
                },
                {
                    "skillId": 2,
                    "skill": "Python"
                }
            ]
        }
    ],
    "tasks": [
        {
            "taskId": 1,
            "title": "Feature A",
            "duration": 10,
            "skills_required": [
                {
                    "skillId": 1,
                    "skill": "Java"
                },
                {
                    "skillId": 2,
                    "skill": "Python"
                },
                {
                    "skillId": 3,
                    "skill": "Wordpress"
                }
            ]
        },
        {
            "taskId": 2,
            "title": "Feature B",
            "duration": 9,
            "skills_required": [
                {
                    "skillId": 2,
                    "skill": "Python"
                },
                {
                    "skillId": 3,
                    "skill": "Wordpress"
                }
            ]
        },
        {
            "taskId": 3,
            "title": "Feature C",
            "duration": 5,
            "skills_required": [
                {
                    "skillId": 3,
                    "skill": "Wordpress"
                },
                {
                    "skillId": 4,
                    "skill": "Javascript"
                }
            ]
        }
    ]
}
``` 
#### The output should be:
```
{
    "Feature A": "John Doe",
    "Feature C": "Unassigned",
    "Feature B": "Unassigned"
}
```

### Sample payloads 2
```
{
    "engineers": [
        {
            "engineerId": 6,
            "name": "Esther Conor",
            "availability": true,
            "skills": [
                {
                    "skillId": 7,
                    "skill": "UI/UX"
                }
            ]
        },
        {
            "engineerId": 3,
            "name": "Michael Philips",
            "availability": false,
            "skills": [
                {
                    "skillId": 3,
                    "skill": "Wordpress"
                }
            ]
        }
    ],
    "tasks": [
        {
            "taskId": 7,
            "title": "Patch Syntax 1",
            "duration": 7,
            "skills_required": [
                {
                    "skillId": 7,
                    "skill": "UI/UX"
                }
            ]
        },
        {
            "taskId": 3,
            "title": "Feature C",
            "duration": 5,
            "skills_required": [
                {
                    "skillId": 3,
                    "skill": "Wordpress"
                },
                {
                    "skillId": 4,
                    "skill": "Javascript"
                }
            ]
        }
    ]
}
``` 

#### The output should be: 
```
{
    "Feature C": "Unassigned",
    "Patch Syntax 1": "Esther Conor"
}
```

