INSERT INTO skills (skill_id, skill) VALUES (1, 'Java');
INSERT INTO skills (skill_id, skill) VALUES (2, 'Python');
INSERT INTO skills (skill_id, skill) VALUES (3, 'Wordpress');
INSERT INTO skills (skill_id, skill) VALUES (4, 'Javascript');
INSERT INTO skills (skill_id, skill) VALUES (5, 'Devops');
INSERT INTO skills (skill_id, skill) VALUES (6, 'Database');
INSERT INTO skills (skill_id, skill) VALUES (7, 'UI/UX');
INSERT INTO skills (skill_id, skill) VALUES (8, 'Angular');
INSERT INTO skills (skill_id, skill) VALUES (9, 'HTML/CSS');

INSERT INTO engineers (engineer_id, name, availability) VALUES (1, 'John Doe', true);
INSERT INTO engineers (engineer_id, name, availability) VALUES (2, 'Bruno Mars', true);
INSERT INTO engineers (engineer_id, name, availability) VALUES (3, 'Michael Philips', false);
INSERT INTO engineers (engineer_id, name, availability) VALUES (4, 'Alicia Keys', true);
INSERT INTO engineers (engineer_id, name, availability) VALUES (5, 'John Mark', true);
INSERT INTO engineers (engineer_id, name, availability) VALUES (6, 'Esther Conor', true);
INSERT INTO engineers (engineer_id, name, availability) VALUES (7, 'Vincent Brown', true);
INSERT INTO engineers (engineer_id, name, availability) VALUES (8, 'Paul Walker', true);
INSERT INTO engineers (engineer_id, name, availability) VALUES (9, 'Mary Knight', true);

INSERT INTO tasks (task_id, duration, title) VALUES (1, 10, 'Feature A');
INSERT INTO tasks (task_id, duration, title) VALUES (2, 9, 'Feature B');
INSERT INTO tasks (task_id, duration, title) VALUES (3, 5, 'Feature C');
INSERT INTO tasks (task_id, duration, title) VALUES (4, 6, 'Hotfix 1');
INSERT INTO tasks (task_id, duration, title) VALUES (5, 5, 'Hotfix 2');
INSERT INTO tasks (task_id, duration, title) VALUES (6, 4, 'Hotfix 3');
INSERT INTO tasks (task_id, duration, title) VALUES (7, 7, 'Patch Syntax 1');
INSERT INTO tasks (task_id, duration, title) VALUES (8, 5, 'Patch Syntax 2');
INSERT INTO tasks (task_id, duration, title) VALUES (9, 6, 'Patch Syntax 3');

INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (1, 1);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (2, 2);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (3, 3);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (4, 4);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (5, 6);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (6, 7);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (7, 8);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (8, 8);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (9, 9);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (1, 2);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (2, 5);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (3, 6);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (4, 7);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (5, 6);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (1, 3);
INSERT INTO engineer_skills (engineer_id, skill_id) VALUES (3, 2);

INSERT INTO task_skills (task_id, skill_id) VALUES (1, 1);
INSERT INTO task_skills (task_id, skill_id) VALUES (2, 2);
INSERT INTO task_skills (task_id, skill_id) VALUES (3, 3);
INSERT INTO task_skills (task_id, skill_id) VALUES (4, 4);
INSERT INTO task_skills (task_id, skill_id) VALUES (5, 5);
INSERT INTO task_skills (task_id, skill_id) VALUES (6, 6);
INSERT INTO task_skills (task_id, skill_id) VALUES (7, 7);
INSERT INTO task_skills (task_id, skill_id) VALUES (8, 8);
INSERT INTO task_skills (task_id, skill_id) VALUES (9, 9);
INSERT INTO task_skills (task_id, skill_id) VALUES (1, 2);
INSERT INTO task_skills (task_id, skill_id) VALUES (2, 3);
INSERT INTO task_skills (task_id, skill_id) VALUES (3, 4);
INSERT INTO task_skills (task_id, skill_id) VALUES (4, 5);
INSERT INTO task_skills (task_id, skill_id) VALUES (1, 3);