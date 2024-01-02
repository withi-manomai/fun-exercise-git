# Fun Exercise: Git Collaboration and Feature Toggle Challenge
## Table of Contents
- [Challenge 1: Three-Way Merge Practice by using git commit and git merge](#challenge-1-three-way-merge-practice-by-using-git-commit-and-git-merge)

- [Challenge 2: Three-Way Merge Practice by using Pull Request](#challenge-2-three-way-merge-practice-by-using-pull-request)

- [Challenge 3: Feature Toggle](#challenge-4-feature-toggle)

- [Challenge 4: Tag version](#challenge-3-tag-version)

# Prerequisites
- [Git](https://git-scm.com/downloads)
- [Java 17](https://www.oracle.com/java/technologies/downloads/#java17) or any Java version that you prefer

# Instructions
## Step 1: Fork the repository
- Click on the `Fork` button on the top right corner of this page (fork the repository to your own GitHub account)[https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/working-with-forks/fork-a-repo#forking-a-repository]

## Step 2: Clone the forked repository to your local machine
- Clone the forked repository to your local machine
```bash
git clone <your-forked-repository-url>
```

## Challenge 1: Three-Way Merge Practice by using git commit and git merge
### Guide:
- Create a new branch from the `main` branch e.g. `maithai-feature`
- Checkout to the new branch
- Edit the `CONTRIBUTORS.md` file by adding your name to the `Contributors` section
- Commit the changes
- Checkout to the `main` branch
- Merge the new branch to the `main` branch
- Push the changes to the remote repository at main branch
verify by using `git log --graph --oneline`. You should see the commit history like below:
```bash
* commit C (main): Merge branch 'maithai-feature'
|\
| * commit B (maithai-feature): Implement feature A
|/
* commit A: Initial project setup
```

<details>
<summary>Hint Challenge 1 (try it your self first before open this hint)</summary>

- Create a new branch from the `main` branch e.g. `maithai-feature`
```bash
git branch maithai-feature
```
- Checkout to the new branch
```bash
git checkout maithai-feature
```
- Edit the `CONTRIBUTORS.md` file by adding your name to the `Contributors` section
- Commit the changes
```bash
git add CONTRIBUTORS.md
git commit -m "Add my name to the Contributors section"
```
- Checkout to the `main` branch
```bash
git checkout main
```
- Merge the new branch to the `main` branch
```bash
git merge maithai-feature --no-ff
```
- Push the changes to the remote repository at main branch
```bash
git push origin main
```

</details>


## Challenge 2: Three-Way Merge Practice by using Pull Request
### Guide:
- Create a new branch from the `main` branch e.g. `monkan-feature`
- Checkout to the new branch
- Edit the `CONTRIBUTORS.md` file by adding your name to the `Contributors` section
- Commit the changes
- Push the changes to the remote repository at the new branch
- Create a Pull Request from the new branch to the `main` branch
- Merge the Pull Request
- Pull the changes from the remote repository at the `main` branch
- Verify by using `git log --graph --oneline`. You should see the commit history like below:
```bash
* commit E (HEAD -> main, origin/main): Merge pull request #1 from <your-github-username>/monkan-feature
|\
| * commit C (monkan-feature): Implement feature A
|/
* commit C (main): Merge branch 'maithai-feature'
|\
| * commit B (maithai-feature): Implement feature A
|/
* commit A: Initial project setup
```

<details>
<summary>Hint Challenge 2 (try it your self first before open this hint)</summary>

- Create a new branch from the `main` branch e.g. `monkan-feature`
```bash
git branch monkan-feature
```
- Checkout to the new branch
```bash
git checkout monkan-feature
```
- Edit the `CONTRIBUTORS.md` file by adding your name to the `Contributors` section
- Commit the changes
```bash
git add CONTRIBUTORS.md
git commit -m "Add my name to the Contributors section"
```
- Push the changes to the remote repository at the new branch
```bash
git push origin monkan-feature
```
- Create a Pull Request from the new branch to the `main` branch
- Merge the Pull Request
- Pull the changes from the remote repository at the `main` branch
```bash
git pull origin main
```

</details>

## Challenge 3: Feature Toggle
### Guide:
- Checkout to the `main` branch
- Enable the feature by changing the featureToggle.setEmailNotificationEnabled to `true`
- Verify the result make sure the email notification is sent to the email address that you specified
- Commit the changes on the `main` branch
- Push the changes to the remote repository at the `main` branch
verify by using `make run`. You should see the email notification is sent to the email address that you specified
```bash
Email notification feature toggle is ENABLED
Sending email to kbtg@kampus.com: Hello, Java!
```

<details>
<summary>Hint Challenge 3 (try it your self first before open this hint)</summary>

- Checkout to the `main` branch
```bash
git checkout main
```
- Enable the feature by changing the featureToggle.setEmailNotificationEnabled to `true`
- Verify the result make sure the email notification is sent to the email address that you specified
```bash
make run
```
- Commit the changes on the `main` branch
```bash
git add src/main/java/com/kbtg/kampus/featuretoggle/FeatureToggle.java
git commit -m "Enable email notification feature toggle"
```
- Push the changes to the remote repository at the `main` branch
```bash
git push origin main
```

</details>

