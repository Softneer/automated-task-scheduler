DROP TABLE IF EXISTS skills;
CREATE TABLE skills (
  skill_id int NOT NULL AUTO_INCREMENT,
  skill varchar(255) DEFAULT NULL,
  PRIMARY KEY (skill_id)
);

DROP TABLE IF EXISTS engineers;
CREATE TABLE engineers (
     engineer_id int NOT NULL AUTO_INCREMENT,
     availability bit(1) NOT NULL,
     name varchar(255) DEFAULT NULL,
     PRIMARY KEY (engineer_id)
);

DROP TABLE IF EXISTS tasks;
CREATE TABLE tasks (
     task_id int NOT NULL AUTO_INCREMENT,
     duration int NOT NULL,
     title varchar(255) DEFAULT NULL,
     PRIMARY KEY (task_id)
);

DROP TABLE IF EXISTS task_skills;
CREATE TABLE task_skills (
   task_id int NOT NULL,
   skill_id int NOT NULL,
   KEY FKnxe8853skguaaw8cadu97lct4 (skill_id),
   KEY FKh3kmv13l1fpy2bs46p8d4tm65 (task_id),
   CONSTRAINT FKh3kmv13l1fpy2bs46p8d4tm65 FOREIGN KEY (task_id) REFERENCES tasks (task_id),
   CONSTRAINT FKnxe8853skguaaw8cadu97lct4 FOREIGN KEY (skill_id) REFERENCES skills (skill_id)
);

DROP TABLE IF EXISTS engineer_skills;
CREATE TABLE engineer_skills (
   engineer_id int NOT NULL,
   skill_id int NOT NULL,
   KEY FKjgtkqxw5ktt9ewc539d9vtjdu (skill_id),
   KEY FK6iavh0dlx1h52ml3i9fqhptrs (engineer_id),
   CONSTRAINT FK6iavh0dlx1h52ml3i9fqhptrs FOREIGN KEY (engineer_id) REFERENCES engineers (engineer_id),
   CONSTRAINT FKjgtkqxw5ktt9ewc539d9vtjdu FOREIGN KEY (skill_id) REFERENCES skills (skill_id)
);