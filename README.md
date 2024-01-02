# Fun Exercise: Git Collaboration and Feature Toggle Challenge
## Table of Contents
- [Challenge 1: Three-Way Merge Practice by using git commit and git merge](#challenge-1-three-way-merge-practice-by-using-git-commit-and-git-merge)

- [Challenge 2: Three-Way Merge Practice by using Pull Request](#challenge-2-three-way-merge-practice-by-using-pull-request)

- [Challenge 3: Tag version](#challenge-3-tag-version)

- [Challenge 4: Feature Toggle](#challenge-4-feature-toggle)

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
