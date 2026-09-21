const characterData = [
    {
        id: 1,
        name: "Ryu",
        abilities: ["Hadouken", "Shoryuken", "Tatsumaki Senpukyaku"],
        stats: {
            health: 100,
            attack: 80,
            defense: 70,
        }
    },
    {
        id: 2,
        name: "Chun-Li",
        abilities: ["Kikoken", "Spinning Bird Kick", "Lightning Legs"],
        stats: {
            health: 90,
            attack: 75,
            defense: 65,
        }
    },
    {
        id: 3,
        name: "Ken",
        abilities: ["Hadouken", "Shoryuken", "Tatsumaki Senpukyaku"],
        stats: {
            health: 95,
            attack: 85,
            defense: 60,
        }
    },
    {
        id: 4,
        name: "Blanka",
        abilities: ["Electric Thunder", "Rolling Attack", "Beast Roll"],
        stats: {
            health: 110,
            attack: 70,
            defense: 80,
        }
    },
    {
        id: 5,
        name: "Guile",
        abilities: ["Sonic Boom", "Flash Kick", "Sonic Hurricane"],
        stats: {
            health: 100,
            attack: 75,
            defense: 75,
        }
    }
];

const getCharacterById = (id) => {
    return characterData.find(character => character.id === id);
};

const getAllCharacters = () => {
    return characterData;
};

const getCharacterStats = (id) => {
    const character = getCharacterById(id);
    return character ? character.stats : null;
};

export { getCharacterById, getAllCharacters, getCharacterStats };