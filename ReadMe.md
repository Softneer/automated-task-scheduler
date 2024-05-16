## Questions / Unknowns
1. Total number of task hours that make an engineer unavailable. We will go with so long as an engineer has a task they are not available
2. Example usage and instruction number 5 contradict. We assume that in case no engineer is available we will return a task and mark it as unassigned. Rather that returning an engineer and say they are Unassigned 

<br> 

## Data.SQL 

```
INSERT INTO skills (skill_id, skill) VALUES (1, 'Java');
INSERT INTO skills (skill_id, skill) VALUES (2, 'Python');
INSERT INTO skills (skill_id, skill) VALUES (3, 'Javascript');

INSERT INTO engineers (engineer_id, name, availability) VALUES (1, 'John Doe', true);
INSERT INTO engineers (engineer_id, name, availability) VALUES (2, 'Bruno Mars', true);
INSERT INTO engineers (engineer_id, name, availability) VALUES (3, 'Michael Philips', false);
INSERT INTO engineers (engineer_id, name, availability) VALUES (4, 'Alicia Keys', true);

INSERT INTO tasks (task_id, duration, title) VALUES (1, 10, 'Feature A');
INSERT INTO tasks (task_id, duration, title) VALUES (2, 6, 'Hotfix 1');
INSERT INTO tasks (task_id, duration, title) VALUES (3, 8, 'Patch Syntax');

INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (1, 1);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (2, 2);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (3, 3);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (1, 2);

INSERT INTO task_skills (task_id, skill_id) VALUES (1, 1);
INSERT INTO task_skills (task_id, skill_id) VALUES (1, 3);
INSERT INTO task_skills (task_id, skill_id) VALUES (2, 3);
INSERT INTO task_skills (task_id, skill_id) VALUES (3, 2);
``` 

<br> 

## Schema.SQL 

